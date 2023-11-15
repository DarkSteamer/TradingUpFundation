package com.trading.TradingUpFundationBackend.service;

import com.trading.TradingUpFundationBackend.commons.domains.DTO.ExerciseSolutionTradingDTO;
import com.trading.TradingUpFundationBackend.commons.domains.ObjectResponse;
import org.springframework.http.ResponseEntity;

public interface IExerciseSolutionTradingService {
    /**
     * Method without body which creates an exercise solution
     * @param exerciseSolutionTradingDTO The exercise solution to be created
     * @return An ObjectResponse with answers depending on the result
     */
    ResponseEntity<ObjectResponse> createExerciseSolutionTrading(ExerciseSolutionTradingDTO exerciseSolutionTradingDTO);

    /**
     * Method without body which reads an exercise solution
     * @param id The id of the exercise solution to be read
     * @return An ObjectResponse with answers depending on the result
     */
    ResponseEntity<ObjectResponse> readExerciseSolutionTrading(Integer id);

    /**
     * Method without body which reads all the exercise solutions
     * @return An ObjectResponse with answers depending on the result
     */
    ResponseEntity<ObjectResponse> readExercisesSolutionsTrading();

    /**
     * Method without body which updates an exercise solution
     * @return An ObjectResponse with answers depending on the result
     */
    ResponseEntity<ObjectResponse> updateExerciseSolutionTrading(ExerciseSolutionTradingDTO exerciseSolutionTradingDTO);
}
