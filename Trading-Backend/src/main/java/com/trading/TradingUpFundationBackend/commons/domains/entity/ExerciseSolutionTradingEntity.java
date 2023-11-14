package com.trading.TradingUpFundationBackend.commons.domains.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "exercise_solution_trading")
public class ExerciseSolutionTradingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solution_exercise_id")
    private Integer id;

    @Column(name = "solution_exercise_comment")
    private String comment;

    @Column(name = "solution_exercise_url_solution")
    private String urlSolution;

    @Column(name = "solution_exercise_user_name")
    private String userName;

    @Column(name = "solution_exercise_exercise_id")
    private Integer idExercise;
}
