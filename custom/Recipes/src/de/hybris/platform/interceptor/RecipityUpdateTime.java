package de.hybris.platform.interceptor;

import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;


public class RecipityUpdateTime implements PrepareInterceptor<RecipeModel>
{
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.LoadInterceptor#onLoad(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final RecipeModel rp, final InterceptorContext arg1) throws InterceptorException
	{
		final Integer value = rp.getTempo();
		final int value_mod = value.intValue() + 10;
		rp.setTempo(Integer.valueOf(value_mod));
	}

}
