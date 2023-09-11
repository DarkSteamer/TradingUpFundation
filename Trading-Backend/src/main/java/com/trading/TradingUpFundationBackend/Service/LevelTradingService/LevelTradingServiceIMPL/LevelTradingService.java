package com.trading.TradingUpFundationBackend.Service.LevelTradingService.LevelTradingServiceIMPL;

import com.trading.TradingUpFundationBackend.Commons.Converter.LevelTradingConverter.LevelTradingConverter;
import com.trading.TradingUpFundationBackend.Repository.LevelTradingRepository.ILevelTradingRepository;
import com.trading.TradingUpFundationBackend.Service.LevelTradingService.ILevelTradingService;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class LevelTradingService implements ILevelTradingService {
    @Autowired
    private ILevelTradingRepository repository;
    @Autowired
    private LevelTradingConverter converter;
}
