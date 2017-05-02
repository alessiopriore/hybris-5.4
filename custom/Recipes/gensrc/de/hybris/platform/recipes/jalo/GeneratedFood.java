/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2-mag-2017 17.18.42                         ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.recipes.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.recipes.constants.RecipesConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Food}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFood extends GenericItem
{
	/** Qualifier of the <code>Food.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Food.nome</code> attribute **/
	public static final String NOME = "nome";
	/** Qualifier of the <code>Food.descrizione</code> attribute **/
	public static final String DESCRIZIONE = "descrizione";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NOME, AttributeMode.INITIAL);
		tmp.put(DESCRIZIONE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.descrizione</code> attribute.
	 * @return the descrizione
	 */
	public String getDescrizione(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFood.getDescrizione requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIZIONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.descrizione</code> attribute.
	 * @return the descrizione
	 */
	public String getDescrizione()
	{
		return getDescrizione( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.descrizione</code> attribute. 
	 * @return the localized descrizione
	 */
	public Map<Language,String> getAllDescrizione(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIZIONE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.descrizione</code> attribute. 
	 * @return the localized descrizione
	 */
	public Map<Language,String> getAllDescrizione()
	{
		return getAllDescrizione( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setDescrizione(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFood.setDescrizione requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIZIONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setDescrizione(final String value)
	{
		setDescrizione( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setAllDescrizione(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIZIONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setAllDescrizione(final Map<Language,String> value)
	{
		setAllDescrizione( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.nome</code> attribute.
	 * @return the nome
	 */
	public String getNome(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFood.getNome requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.nome</code> attribute.
	 * @return the nome
	 */
	public String getNome()
	{
		return getNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.nome</code> attribute. 
	 * @return the localized nome
	 */
	public Map<Language,String> getAllNome(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Food.nome</code> attribute. 
	 * @return the localized nome
	 */
	public Map<Language,String> getAllNome()
	{
		return getAllNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setNome(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFood.setNome requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setNome(final String value)
	{
		setNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setAllNome(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Food.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setAllNome(final Map<Language,String> value)
	{
		setAllNome( getSession().getSessionContext(), value );
	}
	
}
