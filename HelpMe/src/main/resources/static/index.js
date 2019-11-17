Ext.create('Ext.form.Panel', {
	renderTo : document.body,
	title : 'User Form',
	height : 350,
	width : 300,
	bodyPadding : 10,
	defaultType : 'textfield',
	items : [ {
		xtype : 'textfield',
		fieldLabel : 'User Name',
		name : 'username',
		allowBlank : false

	}, {
		xtype : 'numberfield',
		fieldLabel : 'Mobile Number',
		name : 'mobileNumber',
		value : +919650649256,
		allowBlank : false
	}, {
		xtype : 'textfield',
		fieldLabel : 'Contacts',
		name : 'contacts',
		allowBlank : false
	} ],
	buttons : [ {
		text : 'Submit',
		handler : function() {
			var form = this.up('form'); // get the form panel
			if (form.isValid()) { // make sure the form contains valid data
									// before submitting
				form.submit({
					success : function(form, action) {
						Ext.Msg.alert('Success', action.result.msg);
					},
					failure : function(form, action) {
						Ext.Msg.alert('Failed', action.result.msg);
					}
				});
			} else { // display error alert if the data is invalid
				Ext.Msg.alert('Invalid Data', 'Please correct form errors.')
			}
		}
	} ]
});