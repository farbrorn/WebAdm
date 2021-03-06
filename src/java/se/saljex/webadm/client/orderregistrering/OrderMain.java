/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.saljex.webadm.client.orderregistrering;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import java.text.ParseException;
import java.util.ArrayList;
import se.saljex.webadm.client.MainEntryPoint;
import se.saljex.webadm.client.commmon.constants.Const;
import se.saljex.webadm.client.common.AutoHideMessage;
import se.saljex.webadm.client.common.DebugMessagePanel;
import se.saljex.webadm.client.common.Util;
import se.saljex.webadm.client.common.rpcobject.Order1;

/**
 *
 * @author Ulf
 */
public class OrderMain extends FlowPanel implements OrderFormCallback {

	private String anvandare = "UB";
	private final OrderHeaderWidget head = new OrderHeaderWidget();
	private final OrderFormWidget form = new OrderFormWidget(this);
	private final FlowPanel orderBottomFlow = new FlowPanel();
//	private final ScrollPanel formScroll = new ScrollPanel(form);
	private final ScrollPanel headScroll = new ScrollPanel(head);
	private final ScrollPanel bottomScroll = new ScrollPanel(orderBottomFlow);
	
	private AutoHideMessage autoHideMessage = new AutoHideMessage();
	
	private final Button btnSparaOrder = new Button("Spara order", new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			doSparaOrderClick();
		}
	});
	private final Button btnSparaOffert = new Button("Spara offert", new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			doSparaOffertClick();
		}
	});
	private final Button btnAvbryt = new Button("Avbryt");
	
	private final Label orderSumma = new Label("0");
	private final Label orderSummaPrompt = new Label("Total: ");
	
	private final Button btnTest = new Button("test", new ClickHandler() {

		@Override
		public void onClick(ClickEvent event) {
			autoHideMessage.showMsg("Test text");
			DebugMessagePanel.addMessage("levda:" + Util.noNull(head.levdat.getValue()==null ? "null" : head.levdat.getValue().toString()));
		}
	});

	public OrderMain() {
		
		this.addStyleName(Const.Style_Orderreg);
		
		orderSumma.setWidth("10em");
		orderSumma.addStyleName(Const.Style_AlignRight);
		orderSumma.addStyleName(Const.Style_FloatRight);
		orderSummaPrompt.addStyleName(Const.Style_FloatRight);
		btnSparaOrder.addStyleName(Const.Style_Margin_1em_Right);
		btnSparaOrder.addStyleName(Const.Style_FloatLeft);
		btnAvbryt.addStyleName(Const.Style_Margin_1em_Right);
		btnAvbryt.addStyleName(Const.Style_FloatLeft);
		orderBottomFlow.add(orderSumma);
		orderBottomFlow.add(orderSummaPrompt);
		orderBottomFlow.add(btnSparaOrder);
		orderBottomFlow.add(btnSparaOffert);
		orderBottomFlow.add(btnAvbryt);
		orderBottomFlow.add(btnTest);
		
		headScroll.addStyleName(Const.Style_Orderreg_Head);
		add(headScroll);
		
		add(form);
		
		bottomScroll.addStyleName(Const.Style_Orderreg_Bottom);
		
		add(bottomScroll);
		
	}
	
	public void doSparaOrderClick() {
		Util.showModalWait();

		try {
			Order1 tor1;
			tor1 = head.toOrder1();
			ArrayList<OrderRad> rader = new ArrayList<OrderRad>();
			for (OrderFormWidget.Rad rad : form.getRader()) {
				rader.add(rad.orderRad);
			}

			MainEntryPoint.getService().saveOrder(anvandare, tor1, rader, new AsyncCallback<Integer>() {
				@Override
				public void onFailure(Throwable caught) {
					Util.hideModalWait();
					DebugMessagePanel.addMessage("Fel vid spara order: " + caught.getMessage());
				}

				@Override
				public void onSuccess(Integer result) {
					clearOrder();
					Util.hideModalWait();
					autoHideMessage.showMsg("Order " + result + " sparad!");
				}
			});
		} catch (ParseException e) {
			Util.hideModalWait();
			Util.showModalMessage("Något värde i orderhuvudet är felaktig. Kontrollera alla angivna värden. T.ex. kan ett tal eller datum vara fel angivet. " + e.getMessage());
		}
	}
	
	public void doSparaOffertClick() {
		Util.showModalWait();
		
		Order1 tor1;
		try {
			tor1 = head.toOrder1();
			ArrayList<OrderRad> rader = new ArrayList<OrderRad>();
			for (OrderFormWidget.Rad rad : form.getRader()) {
				rader.add(rad.orderRad);
			}

			MainEntryPoint.getService().saveOffert(anvandare, tor1, rader, new AsyncCallback<Integer>() {
				@Override
				public void onFailure(Throwable caught) {
					Util.hideModalWait();
					DebugMessagePanel.addMessage("Fel vid spara offert: " + caught.getMessage());
				}

				@Override
				public void onSuccess(Integer result) {
					clearOrder();
					Util.hideModalWait();
					autoHideMessage.showMsg("Offert " + result + " sparad!");
				}
			});
		} catch (ParseException e) {
			Util.hideModalWait();
			Util.showModalMessage("Något värde i orderhuvudet är felaktig. Kontrollera alla angivna värden. T.ex. kan ett tal eller datum vara fel angivet. " + e.getMessage());
		}
	}
	
	
	private void clearOrder() {
		form.clearForm();
		head.clearHasData();
	}

	@Override
	public void onNewOrdersumma(double summa) {
		orderSumma.setText(Util.format0Dec(summa));
	}



}

