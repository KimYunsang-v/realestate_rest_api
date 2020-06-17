package kr.ac.skuniv.realestate.domain.dto;

import com.querydsl.core.types.ConstructorExpression;
import kr.ac.skuniv.realestate.domain.dto.searchDto.SearchTmpDto;

import javax.annotation.Generated;

/**
 * kr.ac.skuniv.realestate.domain.dto.QSearchTmpDto is a Querydsl Projection type for SearchTmpDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QSearchTmpDto extends ConstructorExpression<SearchTmpDto> {

    private static final long serialVersionUID = 1658699696L;

    public QSearchTmpDto(com.querydsl.core.types.Expression<Long> buildingNo, com.querydsl.core.types.Expression<Integer> city, com.querydsl.core.types.Expression<Integer> groop, com.querydsl.core.types.Expression<String> dong, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Double> area, com.querydsl.core.types.Expression<Integer> floor, com.querydsl.core.types.Expression<String> housingType, com.querydsl.core.types.Expression<String> buildingNum, com.querydsl.core.types.Expression<String> constructYear, com.querydsl.core.types.Expression<Double> price, com.querydsl.core.types.Expression<? extends java.util.Date> date, com.querydsl.core.types.Expression<? extends java.math.BigDecimal> latitude, com.querydsl.core.types.Expression<? extends java.math.BigDecimal> longitude) {
        super(SearchTmpDto.class, new Class<?>[]{long.class, int.class, int.class, String.class, String.class, double.class, int.class, String.class, String.class, String.class, double.class, java.util.Date.class, java.math.BigDecimal.class, java.math.BigDecimal.class}, buildingNo, city, groop, dong, name, area, floor, housingType, buildingNum, constructYear, price, date, latitude, longitude);
    }

}

