package de.hybris.platform.cuppytrail.web.facades;

import de.hybris.platform.cuppytrail.services.StadiumService;
import de.hybris.platform.cuppytrail.web.data.StadiumDataTO;

import java.util.List;


public interface StadiumFacade
{
	StadiumDataTO getStadiumDetails(String name);

	List<StadiumDataTO> getAllStadium();

	void setStadiumService(StadiumService stadiumService);

	StadiumService getStadiumService();
}