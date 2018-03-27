package com.office.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.dao.CheckTimeStatisticsMapper;
import com.office.entity.CheckTimeStatistics;
import com.office.service.CheckTimeStatisticService;
@Service
public class CheckTimeStatisticServiceImpl implements CheckTimeStatisticService{

	@Autowired
	private CheckTimeStatisticsMapper ctsMapper;
	
	@Override
	public List<CheckTimeStatistics> searchAllCheckTimeStatistic() {
		return ctsMapper.selectByExample(null);
	}

	@Override
	public List<CheckTimeStatistics> searchCheckTimeStatisticsByMonth() {
		return null;
	}

	@Override
	public int insertCTSByMonth(int startMonth,int endMonth) {
		
		return 0;
	}

}
