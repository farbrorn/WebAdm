/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.saljex.webadm.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import se.saljex.webadm.client.constants.Const;
import se.saljex.webadm.client.rpcobject.Order1Combo;
import se.saljex.webadm.client.rpcobject.SQLTableList;

/**
 *
 * @author Ulf
 */
public class OverforOrderMainWidget extends FlowPanel{

	FlowPanel sokPanel = new FlowPanel();
	Label sokLabel = new Label("Sök:");
	TextBox	sokInput = new TextBox();
		Button sokBtn = new Button("Sök", new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				sok();
			}
		});

	OverforOrderWidget<Order1Combo> overforWidget = new OverforOrderWidget(new Order1Combo());

	public OverforOrderMainWidget() {

			sokInput.addKeyUpHandler(new KeyUpHandler() {
				@Override
				public void onKeyUp(KeyUpEvent event) {
					if (event.isDownArrow() || event.isUpArrow()) {
						overforWidget.getCellTable().setFocus(true);
					} else	sok();
				}
			});
			sokPanel.add(sokLabel);
			sokPanel.add(sokInput);
			sokPanel.add(sokBtn);
			sokLabel.addStyleName(Const.Style_FloatLeft);
			add(sokPanel);
			add(overforWidget);
			overforWidget.addStyleName(Const.Style_FloatLeft);
			sokPanel.setHeight("2.2em");
			overforWidget.setHeight("90%");
	}

	private void sok() {
		if (Util.isEmpty(sokInput.getText())) overforWidget.setSearch("ordernr", "0", "ordernr", SQLTableList.COMPARE_NONE, SQLTableList.SORT_DESCANDING);
		else overforWidget.getPageLoad().setSearch("ordernr", sokInput.getText(), "ordernr", SQLTableList.COMPARE_SUPERSOK, SQLTableList.SORT_DESCANDING);
	}

}
