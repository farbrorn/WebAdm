/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.saljex.webadm.client.common;

import se.saljex.webadm.client.common.HasShowMessage;
import com.google.gwt.event.dom.client.HasErrorHandlers;
import com.google.gwt.user.client.rpc.AsyncCallback;
import se.saljex.webadm.client.MainEntryPoint;

/**
 *
 * @author Ulf
 */
public class SendOffertEpostHandler extends SendEpostHandler{

	public SendOffertEpostHandler(String anvandare, int fakturanr) {
		super(anvandare, fakturanr);
	}
	public SendOffertEpostHandler(String anvandare, int fakturanr, HasShowMessage showMessage) {
		super(anvandare, fakturanr, showMessage);
	}

	@Override
	public void sendEpost(String epost) {
		MainEntryPoint.getService().sendOffertEpost(anvandare, epost, id, callback);
	}

}
