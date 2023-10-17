package com.trading.TradingUpFundationBackend.commons.domains.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;//Package to add the persistence to this entity
import lombok.Data;//Package of lombok to add the normal methods that an entity has

import java.util.List;

@Entity//Annotation to represent this class like an entity of a database for spring
@Table(name = "user_trading")//Annotation to represent this entity like a table in a database represented with a name
@Data//Annotation to represent normal methods of a normal class

/**
 * Class to represent the entity "user_trading" in de modeling "TradingUpFoundation"
 */
public class UserTradingEntity {
    @Id//Annotation to represent this attribute like an ID who represent this Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Annotation who represent the way of how the id is going to work in each registration
    @Column(name = "user_id")//Annotation to represent this attribute like a column with a name in the table
    private Integer id;

    @Column(name = "user_name",length = 255, nullable = false)//Annotation to represent this attribute like a column with a name in the table, the length has to be 255  or less and it cant be null
    private String name;

    @Column(name = "user_email", length = 255, nullable = false)//Annotation to represent this attribute like a column with a name in the table, the length has to be 255  or less and it cant be null
    private String email;

    @Column(name = "user_password", length = 255, nullable = false)//Annotation to represent this attribute like a column with a name in the table, the length has to be 255  or less and it cant be null
    private String password;

    @Column(name = "user_current_level", nullable = true)//Annotation to represent this attribute like a column with a name in the table, it cant be null
    private Integer userLevel;

    @Column(name = "user_status")//Annotation to represent this attribute like a column with a name in the table, it cant be null
    private boolean status;

    @Column(name = "user_backtesting_link", length = 255, nullable = true)//Annotation to represent this attribute like a column with a name in the table, the length has to be 255 or less
    private String backtesting;

    @Column(name = "user_audited_account", length = 255, nullable = true)//Annotation to represent this attribute like a column with a name in the table, the length has to be 255 or less
    private String auditedAccount;

    @Column(name = "user_role", length = 255, nullable = false)//Anottation to represent this attribute like a column with a name in the table, the lenght has to be 255 or less
    private String userRole;

    @OneToMany(mappedBy = "userTradingEntity")
    @JsonManagedReference
    @JsonIgnore
    private List<ExerciseSolutionTradingEntity> listExerciseSolutionTrading;
}
