package com.doublechaintech.shipping.formaction;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.doublechaintech.shipping.ShippingObjectPlainCustomSerializer;
public class FormActionSerializer extends ShippingObjectPlainCustomSerializer<FormAction>{

	@Override
	public void serialize(FormAction formAction, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
			
		this.writeBaseEntityField(jgen, null, formAction, provider);
		
	}
}










