/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.saljex.webadm.client;

import se.saljex.webadm.client.common.HasFormUpdater;
import com.google.gwt.user.client.ui.FlowPanel;
import se.saljex.webadm.client.common.rpcobject.Kund;

/**
 *
 * @author Ulf
 */
public class KundInfoMainWidget extends FlowPanel implements HasFormUpdater<Kund>{

	KundInfoSheetWidget sheet;
	KundBrowserWithSokWidget kunList = new KundBrowserWithSokWidget(this);

	public KundInfoMainWidget() {
		sheet = new KundInfoSheetWidget(kunList.getBrowserWidget().getPageLoad());
		add(kunList);
		sheet.setWidth("74%");
		kunList.setWidth("24%");
		sheet.setHeight("100%");
		kunList.setHeight("100%");
		sheet.addStyleName("sx-float-left");
		kunList.addStyleName("sx-float-left");
		add(sheet);
		sheet.getForm().addTableRowUpdatedListener(kunList.getBrowserWidget());
	}

	@Override
	public void data2Form(Kund data) {
		sheet.data2Form(data);
	}


	@Override
	public Kund form2Data() {
		return form2Data();
	}




}
