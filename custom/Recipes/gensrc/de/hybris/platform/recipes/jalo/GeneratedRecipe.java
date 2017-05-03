/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3-mag-2017 12.12.11                         ---
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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.recipes.constants.RecipesConstants;
import de.hybris.platform.recipes.jalo.Menu;
import de.hybris.platform.recipes.jalo.RecipeEntry;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Recipe}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRecipe extends GenericItem
{
	/** Qualifier of the <code>Recipe.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Recipe.nome</code> attribute **/
	public static final String NOME = "nome";
	/** Qualifier of the <code>Recipe.descrizione</code> attribute **/
	public static final String DESCRIZIONE = "descrizione";
	/** Qualifier of the <code>Recipe.tempo</code> attribute **/
	public static final String TEMPO = "tempo";
	/** Qualifier of the <code>Recipe.difficolta</code> attribute **/
	public static final String DIFFICOLTA = "difficolta";
	/** Qualifier of the <code>Recipe.persone</code> attribute **/
	public static final String PERSONE = "persone";
	/** Qualifier of the <code>Recipe.recipeEntry</code> attribute **/
	public static final String RECIPEENTRY = "recipeEntry";
	/** Qualifier of the <code>Recipe.menus</code> attribute **/
	public static final String MENUS = "menus";
	/** Relation ordering override parameter constants for Menu2Recipe from ((Recipes))*/
	protected static String MENU2RECIPE_SRC_ORDERED = "relation.Menu2Recipe.source.ordered";
	protected static String MENU2RECIPE_TGT_ORDERED = "relation.Menu2Recipe.target.ordered";
	/** Relation disable markmodifed parameter constants for Menu2Recipe from ((Recipes))*/
	protected static String MENU2RECIPE_MARKMODIFIED = "relation.Menu2Recipe.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n RECIPEENTRY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RecipeEntry> RECIPEENTRYHANDLER = new OneToManyHandler<RecipeEntry>(
	RecipesConstants.TC.RECIPEENTRY,
	false,
	"recipe",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NOME, AttributeMode.INITIAL);
		tmp.put(DESCRIZIONE, AttributeMode.INITIAL);
		tmp.put(TEMPO, AttributeMode.INITIAL);
		tmp.put(DIFFICOLTA, AttributeMode.INITIAL);
		tmp.put(PERSONE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.descrizione</code> attribute.
	 * @return the descrizione
	 */
	public String getDescrizione(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getDescrizione requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIZIONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.descrizione</code> attribute.
	 * @return the descrizione
	 */
	public String getDescrizione()
	{
		return getDescrizione( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.descrizione</code> attribute. 
	 * @return the localized descrizione
	 */
	public Map<Language,String> getAllDescrizione(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIZIONE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.descrizione</code> attribute. 
	 * @return the localized descrizione
	 */
	public Map<Language,String> getAllDescrizione()
	{
		return getAllDescrizione( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setDescrizione(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setDescrizione requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIZIONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setDescrizione(final String value)
	{
		setDescrizione( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setAllDescrizione(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIZIONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.descrizione</code> attribute. 
	 * @param value the descrizione
	 */
	public void setAllDescrizione(final Map<Language,String> value)
	{
		setAllDescrizione( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.difficolta</code> attribute.
	 * @return the difficolta
	 */
	public EnumerationValue getDifficolta(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DIFFICOLTA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.difficolta</code> attribute.
	 * @return the difficolta
	 */
	public EnumerationValue getDifficolta()
	{
		return getDifficolta( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.difficolta</code> attribute. 
	 * @param value the difficolta
	 */
	public void setDifficolta(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DIFFICOLTA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.difficolta</code> attribute. 
	 * @param value the difficolta
	 */
	public void setDifficolta(final EnumerationValue value)
	{
		setDifficolta( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.menus</code> attribute.
	 * @return the menus
	 */
	public Collection<Menu> getMenus(final SessionContext ctx)
	{
		final List<Menu> items = getLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.MENU2RECIPE,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.menus</code> attribute.
	 * @return the menus
	 */
	public Collection<Menu> getMenus()
	{
		return getMenus( getSession().getSessionContext() );
	}
	
	public long getMenusCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			RecipesConstants.Relations.MENU2RECIPE,
			null
		);
	}
	
	public long getMenusCount()
	{
		return getMenusCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.menus</code> attribute. 
	 * @param value the menus
	 */
	public void setMenus(final SessionContext ctx, final Collection<Menu> value)
	{
		setLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.MENU2RECIPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MENU2RECIPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.menus</code> attribute. 
	 * @param value the menus
	 */
	public void setMenus(final Collection<Menu> value)
	{
		setMenus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to menus. 
	 * @param value the item to add to menus
	 */
	public void addToMenus(final SessionContext ctx, final Menu value)
	{
		addLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.MENU2RECIPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MENU2RECIPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to menus. 
	 * @param value the item to add to menus
	 */
	public void addToMenus(final Menu value)
	{
		addToMenus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from menus. 
	 * @param value the item to remove from menus
	 */
	public void removeFromMenus(final SessionContext ctx, final Menu value)
	{
		removeLinkedItems( 
			ctx,
			false,
			RecipesConstants.Relations.MENU2RECIPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MENU2RECIPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from menus. 
	 * @param value the item to remove from menus
	 */
	public void removeFromMenus(final Menu value)
	{
		removeFromMenus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.nome</code> attribute.
	 * @return the nome
	 */
	public String getNome(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.getNome requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.nome</code> attribute.
	 * @return the nome
	 */
	public String getNome()
	{
		return getNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.nome</code> attribute. 
	 * @return the localized nome
	 */
	public Map<Language,String> getAllNome(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.nome</code> attribute. 
	 * @return the localized nome
	 */
	public Map<Language,String> getAllNome()
	{
		return getAllNome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setNome(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRecipe.setNome requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setNome(final String value)
	{
		setNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setAllNome(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.nome</code> attribute. 
	 * @param value the nome
	 */
	public void setAllNome(final Map<Language,String> value)
	{
		setAllNome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.persone</code> attribute.
	 * @return the persone
	 */
	public Integer getPersone(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PERSONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.persone</code> attribute.
	 * @return the persone
	 */
	public Integer getPersone()
	{
		return getPersone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.persone</code> attribute. 
	 * @return the persone
	 */
	public int getPersoneAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPersone( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.persone</code> attribute. 
	 * @return the persone
	 */
	public int getPersoneAsPrimitive()
	{
		return getPersoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.persone</code> attribute. 
	 * @param value the persone
	 */
	public void setPersone(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PERSONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.persone</code> attribute. 
	 * @param value the persone
	 */
	public void setPersone(final Integer value)
	{
		setPersone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.persone</code> attribute. 
	 * @param value the persone
	 */
	public void setPersone(final SessionContext ctx, final int value)
	{
		setPersone( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.persone</code> attribute. 
	 * @param value the persone
	 */
	public void setPersone(final int value)
	{
		setPersone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.recipeEntry</code> attribute.
	 * @return the recipeEntry
	 */
	public Collection<RecipeEntry> getRecipeEntry(final SessionContext ctx)
	{
		return RECIPEENTRYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.recipeEntry</code> attribute.
	 * @return the recipeEntry
	 */
	public Collection<RecipeEntry> getRecipeEntry()
	{
		return getRecipeEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.recipeEntry</code> attribute. 
	 * @param value the recipeEntry
	 */
	public void setRecipeEntry(final SessionContext ctx, final Collection<RecipeEntry> value)
	{
		RECIPEENTRYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.recipeEntry</code> attribute. 
	 * @param value the recipeEntry
	 */
	public void setRecipeEntry(final Collection<RecipeEntry> value)
	{
		setRecipeEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipeEntry. 
	 * @param value the item to add to recipeEntry
	 */
	public void addToRecipeEntry(final SessionContext ctx, final RecipeEntry value)
	{
		RECIPEENTRYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to recipeEntry. 
	 * @param value the item to add to recipeEntry
	 */
	public void addToRecipeEntry(final RecipeEntry value)
	{
		addToRecipeEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipeEntry. 
	 * @param value the item to remove from recipeEntry
	 */
	public void removeFromRecipeEntry(final SessionContext ctx, final RecipeEntry value)
	{
		RECIPEENTRYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from recipeEntry. 
	 * @param value the item to remove from recipeEntry
	 */
	public void removeFromRecipeEntry(final RecipeEntry value)
	{
		removeFromRecipeEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.tempo</code> attribute.
	 * @return the tempo
	 */
	public Integer getTempo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TEMPO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.tempo</code> attribute.
	 * @return the tempo
	 */
	public Integer getTempo()
	{
		return getTempo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.tempo</code> attribute. 
	 * @return the tempo
	 */
	public int getTempoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTempo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Recipe.tempo</code> attribute. 
	 * @return the tempo
	 */
	public int getTempoAsPrimitive()
	{
		return getTempoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.tempo</code> attribute. 
	 * @param value the tempo
	 */
	public void setTempo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TEMPO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.tempo</code> attribute. 
	 * @param value the tempo
	 */
	public void setTempo(final Integer value)
	{
		setTempo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.tempo</code> attribute. 
	 * @param value the tempo
	 */
	public void setTempo(final SessionContext ctx, final int value)
	{
		setTempo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Recipe.tempo</code> attribute. 
	 * @param value the tempo
	 */
	public void setTempo(final int value)
	{
		setTempo( getSession().getSessionContext(), value );
	}
	
}
