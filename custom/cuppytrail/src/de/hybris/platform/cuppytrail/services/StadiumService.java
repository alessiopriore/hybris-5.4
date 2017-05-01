package de.hybris.platform.cuppytrail.services;

import de.hybris.platform.cuppytrail.model.StadiumModel;

import java.util.List;


public interface StadiumService
{
	List<StadiumModel> getAllStadium();

	StadiumModel getStadiumDetails(String code);
}
