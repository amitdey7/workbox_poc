sap.ui.define([
	"sap/ui/core/mvc/Controller"
], function(Controller) {
	"use strict";

	return Controller.extend("sampleApp.controller.mainView", {
		onClick : function() {
			var oSampleJsonModel = new sap.ui.model.json.JSONModel();
			this.getView().setModel(oSampleJsonModel, "oSampleJsonModel");
			oSampleJsonModel.loadData("/workbox_poc/workbox/test",null,true);
			oSampleJsonModel.attachRequestCompleted(function(oEvent) {
			});
		}
	});
});