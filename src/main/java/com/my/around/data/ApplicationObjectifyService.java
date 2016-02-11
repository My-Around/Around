/**
 * 
 */
package com.my.around.data;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.impl.translate.opt.BigDecimalLongTranslatorFactory;
import com.googlecode.objectify.impl.translate.opt.joda.JodaTimeTranslators;

/**
 * @author Sky Strider
 *
 */
public class ApplicationObjectifyService {
	
	static {
		ObjectifyService.factory().getTranslators().add(new BigDecimalLongTranslatorFactory());
		JodaTimeTranslators.add(ObjectifyService.factory());
		ObjectifyService.register(Coordinates.class);
	}
	
	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }

}
