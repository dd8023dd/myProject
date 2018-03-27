package com.office.service;

import java.util.List;

import com.office.entity.CheckTimeStatistics;

public interface CheckTimeStatisticService {

	public int insertCTSByMonth(int startMonth,int endMonth);
	public List<CheckTimeStatistics> searchAllCheckTimeStatistic();
	public List<CheckTimeStatistics> searchCheckTimeStatisticsByMonth();
	
}
