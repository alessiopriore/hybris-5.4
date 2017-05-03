package de.hybris.platform.recipes.jobs;

import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.recipes.model.RecipeModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import org.apache.log4j.Logger;


public class MenuRecipes extends AbstractJobPerformable<CronJobModel>
{

	private static final Logger LOG = Logger.getLogger(MenuRecipes.class);

	@Override
	public PerformResult perform(final CronJobModel arg0)
	{
		final String fsq = "SELECT (PK) FROM (Recipe)";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);
		final SearchResult<RecipeModel> result = (SearchResult<RecipeModel>) flexibleSearchService.search(query);
		final List<RecipeModel> recipes = result.getResult();

		if (recipes.isEmpty())
		{
			LOG.info("Non ci sono ricette");
		}

		return null;
	}

}
