package org.moon.mule.transformers;

import java.nio.charset.Charset;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class ByteArrayToStringTransformer extends AbstractTransformer {

	public static final String DEFAULT_CHARSET = "UTF-8";

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {
		String str = null;
		if (src instanceof byte[]) {
			str = new String((byte[]) src, Charset.forName(DEFAULT_CHARSET));
		}
		return str == null ? src : str;
	}

}