package de.hybris.platform.cuppytrail.web.data;

import java.util.List;


public class StadiumDataTO
{
	private final String capacity;
	private final String name;
	private List<MatchSummaryDataTO> matches;

	public StadiumDataTO(final String name, final Integer capacity)
	{
		this.name = name;
		this.matches = null;
		this.capacity = capacity == null ? "-" : capacity.toString();
	}

	public StadiumDataTO(final String name, final Integer capacity, final List<MatchSummaryDataTO> matches)
	{
		this(name, capacity);
		this.matches = matches;
	}

	public String getName()
	{
		return name;
	}

	public String getCapacity()
	{
		return capacity;
	}

	public List<MatchSummaryDataTO> getMatches()
	{
		return matches;
	}
}