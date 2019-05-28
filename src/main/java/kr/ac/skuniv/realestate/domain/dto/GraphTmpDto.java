package kr.ac.skuniv.realestate.domain.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class GraphTmpDto {

    private String dealType;
    private String housingType;
    private LocalDate date;
    private Double average;

    public GraphTmpDto() {
    }

    @QueryProjection
    public GraphTmpDto(String housingType, LocalDate date, Double average) {
        this.housingType = housingType;
        this.date = date;
        this.average = average;
    }

    public GraphTmpDto(String dealType, String housingType, LocalDate date, Double average) {
        this.dealType = dealType;
        this.housingType = housingType;
        this.date = date;
        this.average = average;
    }

    @Override
    public String toString() {
        return "\nGraphTmpDto{" +
                "\n housingType = '" + housingType + '\'' +
                ", \ndate = " + date +
                ", \ndealType = " + dealType +
                ", \naverage = " + average +
                "}\n";
    }
}
