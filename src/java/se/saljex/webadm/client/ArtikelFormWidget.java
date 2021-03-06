/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.saljex.webadm.client;

import se.saljex.webadm.client.common.PageLoad;
import se.saljex.webadm.client.common.TableFormWidget;
import se.saljex.webadm.client.common.FormTextBox;
import se.saljex.webadm.client.common.FormIntegerTextBox;
import se.saljex.webadm.client.common.FormDoubleTextBox;
import se.saljex.webadm.client.common.FormDateTextBox;
import se.saljex.webadm.client.common.FormCheckBox;
import se.saljex.webadm.client.common.FormWidgetGetSet;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import se.saljex.webadm.client.common.rpcobject.Artikel;

/**
 *
 * @author Ulf
 */
public class ArtikelFormWidget extends TableFormWidget<Artikel>{

	public ArtikelFormWidget() {
		this(null);
	}
	public ArtikelFormWidget(PageLoad<Artikel> pageLoad) {
		this.pageLoad = pageLoad;
		init();
	}




	//mainPanel
	private FormTextBox nummer = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.nummer = nummer.getSQLTableValue();}
		@Override	public void set(Artikel table) {	nummer.setSQLTableValue(table.nummer);	}
	});
	private FormTextBox namn = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.namn = namn.getSQLTableValue();}
		@Override	public void set(Artikel table) {	namn.setSQLTableValue(table.namn);	}
	});
	private FormTextBox katnamn = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.katnamn = katnamn.getSQLTableValue();}
		@Override	public void set(Artikel table) {	katnamn.setSQLTableValue(table.katnamn);	}

	});

	private FormTextBox lev = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.lev = lev.getSQLTableValue();}
		@Override	public void set(Artikel table) {	lev.setSQLTableValue(table.lev); }
		});

		private FormTextBox bestnr = new FormTextBox(new FormWidgetGetSet<Artikel>() {
			@Override	public void get(Artikel table) {	table.bestnr = bestnr.getSQLTableValue();}
			@Override	public void set(Artikel table) {	bestnr.setSQLTableValue(table.bestnr); }
		});

		private FormTextBox enhet = new FormTextBox(new FormWidgetGetSet<Artikel>() {
			@Override	public void get(Artikel table) {	table.enhet = enhet.getSQLTableValue();}
			@Override	public void set(Artikel table) {	enhet.setSQLTableValue(table.enhet); }
		});

		private FormDoubleTextBox utpris = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
			@Override	public void get(Artikel table) {	table.utpris = utpris.getSQLTableValue();}
			@Override	public void set(Artikel table) {	utpris.setSQLTableValue(table.utpris); }
		});


	private FormDoubleTextBox staf_Pris1 = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Pris1 = staf_Pris1.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Pris1.setSQLTableValue(table.staf_Pris1); }
	});

	private FormDoubleTextBox staf_Pris2 = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Pris2 = staf_Pris2.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Pris2.setSQLTableValue(table.staf_Pris2); }
	});

	private FormDateTextBox staf_Pris1_Dat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Pris1_Dat = staf_Pris1_Dat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Pris1_Dat.setSQLTableValue(table.staf_Pris1_Dat); }
	});

	private FormDateTextBox staf_Pris2_Dat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Pris2_Dat = staf_Pris2_Dat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Pris2_Dat.setSQLTableValue(table.staf_Pris2_Dat); }
	});

	private FormDoubleTextBox staf_Antal1 = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Antal1 = staf_Antal1.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Antal1.setSQLTableValue(table.staf_Antal1); }
	});

	private FormDoubleTextBox staf_Antal2 = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Antal2 = staf_Antal2.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Antal2.setSQLTableValue(table.staf_Antal2); }
	});

	private FormDoubleTextBox inpris = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inpris = inpris.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inpris.setSQLTableValue(table.inpris); }
	});

	private FormDoubleTextBox rab = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.rab = rab.getSQLTableValue();}
		@Override	public void set(Artikel table) {	rab.setSQLTableValue(table.rab); }
	});

	private FormDoubleTextBox utrab = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.utrab = utrab.getSQLTableValue();}
		@Override	public void set(Artikel table) {	utrab.setSQLTableValue(table.utrab); }
	});

	private FormDoubleTextBox inp_Pris = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Pris = inp_Pris.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Pris.setSQLTableValue(table.inp_Pris); }
	});

	private FormDoubleTextBox inp_Rab = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Rab = inp_Rab.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Rab.setSQLTableValue(table.inp_Rab); }
	});

	private FormDoubleTextBox inp_Fraktproc = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Fraktproc = inp_Fraktproc.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Fraktproc.setSQLTableValue(table.inp_Fraktproc); }
	});

	private FormTextBox inp_Valuta = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Valuta = inp_Valuta.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Valuta.setSQLTableValue(table.inp_Valuta); }
	});

	private FormDateTextBox inp_Datum = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Datum = inp_Datum.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Datum.setSQLTableValue(table.inp_Datum); }
	});

	private FormTextBox konto = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.konto = konto.getSQLTableValue();}
		@Override	public void set(Artikel table) {	konto.setSQLTableValue(table.konto); }
	});

	private FormTextBox rabkod = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.rabkod = rabkod.getSQLTableValue();}
		@Override	public void set(Artikel table) {	rabkod.setSQLTableValue(table.rabkod); }
	});

	private FormTextBox kod1 = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kod1 = kod1.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kod1.setSQLTableValue(table.kod1); }
	});

	private FormDateTextBox prisdatum = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.prisdatum = prisdatum.getSQLTableValue();}
		@Override	public void set(Artikel table) {	prisdatum.setSQLTableValue(table.prisdatum); }
	});

	private FormDateTextBox inpdat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inpdat = inpdat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inpdat.setSQLTableValue(table.inpdat); }
	});

	private FormTextBox refnr = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.refnr = refnr.getSQLTableValue();}
		@Override	public void set(Artikel table) {	refnr.setSQLTableValue(table.refnr); }
	});

	private FormDoubleTextBox vikt = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.vikt = vikt.getSQLTableValue();}
		@Override	public void set(Artikel table) {	vikt.setSQLTableValue(table.vikt); }
	});

	private FormDoubleTextBox volym = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.volym = volym.getSQLTableValue();}
		@Override	public void set(Artikel table) {	volym.setSQLTableValue(table.volym); }
	});

	private FormTextBox struktnr = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.struktnr = struktnr.getSQLTableValue();}
		@Override	public void set(Artikel table) {	struktnr.setSQLTableValue(table.struktnr); }
	});

	private FormDoubleTextBox forpack = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.forpack = forpack.getSQLTableValue();}
		@Override	public void set(Artikel table) {	forpack.setSQLTableValue(table.forpack); }
	});

	private FormDoubleTextBox kop_Pack = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kop_Pack = kop_Pack.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kop_Pack.setSQLTableValue(table.kop_Pack); }
	});

	private FormDateTextBox kampfrdat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kampfrdat = kampfrdat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kampfrdat.setSQLTableValue(table.kampfrdat); }
	});

	private FormDateTextBox kamptidat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kamptidat = kamptidat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kamptidat.setSQLTableValue(table.kamptidat); }
	});

	private FormDoubleTextBox kamppris = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kamppris = kamppris.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kamppris.setSQLTableValue(table.kamppris); }
	});

	private FormDoubleTextBox kampprisstaf1 = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kampprisstaf1 = kampprisstaf1.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kampprisstaf1.setSQLTableValue(table.kampprisstaf1); }
	});

	private FormDoubleTextBox kampprisstaf2 = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kampprisstaf2 = kampprisstaf2.getSQLTableValue();}
		@Override	public void set(Artikel table) {	kampprisstaf2.setSQLTableValue(table.kampprisstaf2); }
	});

	private FormDoubleTextBox inp_Miljo = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Miljo = inp_Miljo.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Miljo.setSQLTableValue(table.inp_Miljo); }
	});

	private FormDoubleTextBox inp_Frakt = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Frakt = inp_Frakt.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Frakt.setSQLTableValue(table.inp_Frakt); }
	});

	private FormTextBox anvisnr = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.anvisnr = anvisnr.getSQLTableValue();}
		@Override	public void set(Artikel table) {	anvisnr.setSQLTableValue(table.anvisnr); }
	});

	private FormDoubleTextBox staf_Pris1ny = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Pris1ny = staf_Pris1ny.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Pris1ny.setSQLTableValue(table.staf_Pris1ny); }
	});

	private FormDoubleTextBox staf_Pris2ny = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.staf_Pris2ny = staf_Pris2ny.getSQLTableValue();}
		@Override	public void set(Artikel table) {	staf_Pris2ny.setSQLTableValue(table.staf_Pris2ny); }
	});

	private FormDoubleTextBox inprisny = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inprisny = inprisny.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inprisny.setSQLTableValue(table.inprisny); }
	});

	private FormDateTextBox inprisnydat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inprisnydat = inprisnydat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inprisnydat.setSQLTableValue(table.inprisnydat); }
	});

	private FormDoubleTextBox inprisnyrab = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inprisnyrab = inprisnyrab.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inprisnyrab.setSQLTableValue(table.inprisnyrab); }
	});

	private FormDoubleTextBox utprisny = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.utprisny = utprisny.getSQLTableValue();}
		@Override	public void set(Artikel table) {	utprisny.setSQLTableValue(table.utprisny); }
	});

	private FormDateTextBox utprisnydat = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.utprisnydat = utprisnydat.getSQLTableValue();}
		@Override	public void set(Artikel table) {	utprisnydat.setSQLTableValue(table.utprisnydat); }
	});

	private FormTextBox rsk = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.rsk = rsk.getSQLTableValue();}
		@Override	public void set(Artikel table) {	rsk.setSQLTableValue(table.rsk); }
	});

	private FormTextBox enummer = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.enummer = enummer.getSQLTableValue();}
		@Override	public void set(Artikel table) {	enummer.setSQLTableValue(table.enummer); }
	});

	private FormIntegerTextBox kampkundartgrp = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kampkundartgrp = new Integer(kampkundartgrp.getSQLTableValue()).shortValue();}
		@Override	public void set(Artikel table) {	kampkundartgrp.setSQLTableValue(new Integer(table.kampkundartgrp)); }
	});

	private FormIntegerTextBox kampkundgrp = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.kampkundgrp = new Integer(kampkundgrp.getSQLTableValue()).shortValue();}
		@Override	public void set(Artikel table) {	kampkundgrp.setSQLTableValue(new Integer(table.kampkundgrp)); }
	});

	private FormTextBox cn8 = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.cn8 = cn8.getSQLTableValue();}
		@Override	public void set(Artikel table) {	cn8.setSQLTableValue(table.cn8); }
	});

	private FormIntegerTextBox fraktvillkor = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.fraktvillkor = new Integer(fraktvillkor.getSQLTableValue()).shortValue();}
		@Override	public void set(Artikel table) {	fraktvillkor.setSQLTableValue(new Integer(table.fraktvillkor)); }
	});

	private FormCheckBox dagspris = new FormCheckBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.dagspris = dagspris.getSQLTableValue();}
		@Override	public void set(Artikel table) {	dagspris.setSQLTableValue(table.dagspris); }
	});

	private FormCheckBox hindraexport = new FormCheckBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.hindraexport = hindraexport.getSQLTableValue();}
		@Override	public void set(Artikel table) {	hindraexport.setSQLTableValue(table.hindraexport); }
	});

	private FormDateTextBox utgattdatum = new FormDateTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.utgattdatum = utgattdatum.getSQLTableValue();}
		@Override	public void set(Artikel table) {	utgattdatum.setSQLTableValue(table.utgattdatum); }
	});

	private FormDoubleTextBox minsaljpack = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.minsaljpack = minsaljpack.getSQLTableValue();}
		@Override	public void set(Artikel table) {	minsaljpack.setSQLTableValue(table.minsaljpack); }
	});

	private FormDoubleTextBox storpack = new FormDoubleTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.storpack = storpack.getSQLTableValue();}
		@Override	public void set(Artikel table) {	storpack.setSQLTableValue(table.storpack); }
	});

	private FormIntegerTextBox prisgiltighetstid = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.prisgiltighetstid = prisgiltighetstid.getSQLTableValue();}
		@Override	public void set(Artikel table) {	prisgiltighetstid.setSQLTableValue(table.prisgiltighetstid); }
	});

	private FormIntegerTextBox onskattb = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.onskattb = onskattb.getSQLTableValue();}
		@Override	public void set(Artikel table) {	onskattb.setSQLTableValue(table.onskattb); }
	});

	private FormIntegerTextBox onskattbstaf1 = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.onskattbstaf1 = onskattbstaf1.getSQLTableValue();}
		@Override	public void set(Artikel table) {	onskattbstaf1.setSQLTableValue(table.onskattbstaf1); }
	});

	private FormIntegerTextBox onskattbstaf2 = new FormIntegerTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.onskattbstaf2 = onskattbstaf2.getSQLTableValue();}
		@Override	public void set(Artikel table) {	onskattbstaf2.setSQLTableValue(table.onskattbstaf2); }
	});

	private FormCheckBox direktlev = new FormCheckBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.direktlev = direktlev.getSQLTableValue();}
		@Override	public void set(Artikel table) {	direktlev.setSQLTableValue(table.direktlev); }
	});

	private FormTextBox bildartnr = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.bildartnr = bildartnr.getSQLTableValue();}
		@Override	public void set(Artikel table) {	bildartnr.setSQLTableValue(table.bildartnr); }
	});

	private FormTextBox plockinstruktion = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.plockinstruktion = plockinstruktion.getSQLTableValue();}
		@Override	public void set(Artikel table) {	plockinstruktion.setSQLTableValue(table.plockinstruktion); }
	});

	private FormTextBox inp_Enh = new FormTextBox(new FormWidgetGetSet<Artikel>() {
		@Override	public void get(Artikel table) {	table.inp_Enh = inp_Enh.getSQLTableValue();}
		@Override	public void set(Artikel table) {	inp_Enh.setSQLTableValue(table.inp_Enh); }
	});





	private void init() {
		add(saveBtn);


		FlexTable inputTable = new FlexTable();
		inputTable.getRowFormatter().setVerticalAlign(0, HasVerticalAlignment.ALIGN_TOP);
		FlexTable groupPanel;
		groupPanel = new FlexTable();
		inputTable.setWidget(0, 0, groupPanel);
		addInputWithStandardKeyDownHandler(groupPanel, "Nummer", nummer);
		addInputWithStandardKeyDownHandler(groupPanel, "Namn",  namn);
		addInputWithStandardKeyDownHandler(groupPanel, "Katnamn",  katnamn);
		addInputWithStandardKeyDownHandler(groupPanel, "Lev",  lev);
		addInputWithStandardKeyDownHandler(groupPanel, "Bestnr",  bestnr);
		addInputWithStandardKeyDownHandler(groupPanel, "Refnr",  refnr);
		addInputWithStandardKeyDownHandler(groupPanel, "Rsk",  rsk);
		addInputWithStandardKeyDownHandler(groupPanel, "E-nummer",  enummer);
		addInputWithStandardKeyDownHandler(groupPanel, "Enhet",  enhet);

		addInputWithStandardKeyDownHandler(groupPanel, "Utpris", utpris);
		addInputWithStandardKeyDownHandler(groupPanel, "Inpris", inpris);
		addInputWithStandardKeyDownHandler(groupPanel, "rab", rab);
		addInputWithStandardKeyDownHandler(groupPanel, "Utrab", utrab);
		addInputWithStandardKeyDownHandler(groupPanel, "Prisdatum Ut",  prisdatum);
		addInputWithStandardKeyDownHandler(groupPanel, "Prisdatum In",  inpdat);

		addInputWithStandardKeyDownHandler(groupPanel, "Rabkod",  rabkod);
		addInputWithStandardKeyDownHandler(groupPanel, "Rab undergrupp",  kod1);

		addInputWithStandardKeyDownHandler(groupPanel, "Önskat TB", onskattb);
		addInputWithStandardKeyDownHandler(groupPanel, "Önskat TB Staf1", onskattbstaf1);
		addInputWithStandardKeyDownHandler(groupPanel, "Önskat TB Staf2", onskattbstaf2);


//		addInputWithStandardKeyDownHandler(groupPanel, "inp_Pris", inp_Pris);
//		addInputWithStandardKeyDownHandler(groupPanel, "inp_Rab", inp_Rab);
//		addInputWithStandardKeyDownHandler(groupPanel, " inp_Enh",  inp_Enh);
//		addInputWithStandardKeyDownHandler(groupPanel, " inp_Valuta",  inp_Valuta);
//		addInputWithStandardKeyDownHandler(groupPanel, " inp_Datum",  inp_Datum);
//		addInputWithStandardKeyDownHandler(groupPanel, "staf_Pris1ny", staf_Pris1ny);
//		addInputWithStandardKeyDownHandler(groupPanel, "staf_Pris2ny", staf_Pris2ny);
//		addInputWithStandardKeyDownHandler(groupPanel, "inprisny", inprisny);
//		addInputWithStandardKeyDownHandler(groupPanel, " inprisnydat",  inprisnydat);
//		addInputWithStandardKeyDownHandler(groupPanel, "inprisnyrab", inprisnyrab);
//		addInputWithStandardKeyDownHandler(groupPanel, "utprisny", utprisny);
//		addInputWithStandardKeyDownHandler(groupPanel, " utprisnydat",  utprisnydat);

		groupPanel = new FlexTable();
		inputTable.setWidget(0, 1, groupPanel);
		groupPanel.setCellPadding(0);
		addInputWithStandardKeyDownHandler(groupPanel, "Staf 1 Pris", staf_Pris1);
		addInputWithStandardKeyDownHandler(groupPanel, "Staf 2 Pris", staf_Pris2);
		addInputWithStandardKeyDownHandler(groupPanel, "Staf 1 Antal", staf_Antal1);
		addInputWithStandardKeyDownHandler(groupPanel, "staf 2 Antal", staf_Antal2);
		addInputWithStandardKeyDownHandler(groupPanel, "Staf 1 Datum",  staf_Pris1_Dat);
		addInputWithStandardKeyDownHandler(groupPanel, "Staf 2 Datum",  staf_Pris2_Dat);

		addInputWithStandardKeyDownHandler(groupPanel, "Frakt %", inp_Fraktproc);
		addInputWithStandardKeyDownHandler(groupPanel, "Miljöavgift", inp_Miljo);
		addInputWithStandardKeyDownHandler(groupPanel, "Frakt", inp_Frakt);
		addInputWithStandardKeyDownHandler(groupPanel, "Konto",  konto);
		addInputWithStandardKeyDownHandler(groupPanel, "Vikt", vikt);
		addInputWithStandardKeyDownHandler(groupPanel, "Volym", volym);
		addInputWithStandardKeyDownHandler(groupPanel, "Struktur",  struktnr);
		addInputWithStandardKeyDownHandler(groupPanel, "Förpackning", forpack);
		addInputWithStandardKeyDownHandler(groupPanel, "Inköpsförpackning", kop_Pack);
		addInputWithStandardKeyDownHandler(groupPanel, "Minsta säljförpackning", minsaljpack);
		addInputWithStandardKeyDownHandler(groupPanel, "Storpack", storpack);


		groupPanel = new FlexTable();
		inputTable.setWidget(0, 2, groupPanel);
		groupPanel.setCellPadding(0);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanj från",  kampfrdat);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanj till",  kamptidat);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanjpris", kamppris);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanjpris Staf1", kampprisstaf1);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanjpris Staf2", kampprisstaf2);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanj Kundartgrp", kampkundartgrp);
		addInputWithStandardKeyDownHandler(groupPanel, "Kampanj Kundgrupp", kampkundgrp);

		addInputWithStandardKeyDownHandler(groupPanel, "Anvisningsnr",  anvisnr);
		addInputWithStandardKeyDownHandler(groupPanel, "Varukod CN8",  cn8);
		addInputWithStandardKeyDownHandler(groupPanel, "Fraktvillkor", fraktvillkor);
		addInputWithStandardKeyDownHandler(groupPanel, "Dagspris", dagspris);
		addInputWithStandardKeyDownHandler(groupPanel, "Hindra export", hindraexport);
		addInputWithStandardKeyDownHandler(groupPanel, "Utgått",  utgattdatum);
		addInputWithStandardKeyDownHandler(groupPanel, "Prisgiltighetstid", prisgiltighetstid);
		addInputWithStandardKeyDownHandler(groupPanel, "Direktleverans", direktlev);
		addInputWithStandardKeyDownHandler(groupPanel, "Artikelnr på bild",  bildartnr);
		addInputWithStandardKeyDownHandler(groupPanel, "Plockinstruktion",  plockinstruktion);

		add(inputTable);

		nummer.addKeyDownHandler(new KeyDownHandler() {	@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("nummer", nummer.getValue(), event);	}	});
		namn.addKeyDownHandler(new KeyDownHandler() {@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("namn", namn.getValue(), event);		}	});
		lev.addKeyDownHandler(new KeyDownHandler() {@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("lev", lev.getValue(), event);		}	});
		bestnr.addKeyDownHandler(new KeyDownHandler() {@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("bestnr", bestnr.getValue(), event);		}	});
		refnr.addKeyDownHandler(new KeyDownHandler() {@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("refnr", refnr.getValue(), event);		}	});
		enummer.addKeyDownHandler(new KeyDownHandler() {@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("enummer", enummer.getValue(), event);		}	});
		rsk.addKeyDownHandler(new KeyDownHandler() {@Override	public void onKeyDown(KeyDownEvent event) {	doSetKeyCodeSearch("rsk", rsk.getValue(), event);		}	});
	}


	@Override
	public Artikel form2Data() {
		Artikel Artikel = new Artikel(originalSQLTableRow);
		focusForm.get(Artikel);
		return Artikel;

	}

	@Override
	public void data2Form(Artikel artikel) {
		if (artikel==null) {
			originalSQLTableRow=null;
			focusForm.set(new Artikel());
		} else {
			focusForm.set(artikel);
			originalSQLTableRow = artikel;
		}
	}


}
