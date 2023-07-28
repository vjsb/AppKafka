package serializer;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Venda;

public class VendaSerializer implements Serializer<Venda> {

	//transforma uma venda em um array de bytes
	//transformo em um JSON e depois em um array de bytes usando Jackson
	@Override
	public byte[] serialize(String topic, Venda venda) {
		
		try {
			return new ObjectMapper().writeValueAsBytes(venda);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
