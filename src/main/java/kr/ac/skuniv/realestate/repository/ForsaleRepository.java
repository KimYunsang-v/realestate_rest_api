package kr.ac.skuniv.realestate.repository;

import kr.ac.skuniv.realestate.domain.entity.Forsale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ForsaleRepository extends JpaRepository<Forsale, Long> {

    @Query("select f from Forsale  f where f.code like :code")
    List<Forsale> getCode(@Param("code") String code);

    @Query(value = "select f.code, function('date_format', f.date, '%Y-%m'), avg(f.price), count(f.code) from Forsale f  where f.code like concat(:code, '%') group by function('date_format', f.date, '%Y-%m')")
    List<Object> getByCode(@Param("code") int code);

    @Query(value = "select f.dealType, f.housingType, f.date, avg(f.price) from Forsale f  where f.code like concat(:code, '%') group by f.dealType, f.housingType, function('date_format', f.date, '%Y') order by f.dealType, f.housingType")
    List<Object[]> getByCodeAndDateOnYear(@Param("code") int code);

    @Query(value = "select f.dealType, f.housingType, f.date, avg(f.price) from Forsale f  where f.code like concat(:code, '%') and function('date_format', f.date, '%Y' ) = function('date_format', :date, '%Y' ) group by f.dealType, f.housingType, function('date_format', f.date, '%Y-%m')")
    List<Object[]> getByCodeAndDateOnMonth(@Param("code") int code, @Param("date") LocalDate date);

    @Query(value = "select f.dealType, f.housingType, f.date, avg(f.price) from Forsale f  where f.code like concat(:code, '%') and function('date_format', f.date, '%Y-%m' ) = :date group by f.dealType, f.housingType, function('date_format', f.date, '%Y-%m-%d')")
    List<Object[]> getByCodeAndDateOnDay(@Param("code") int code, @Param("date") LocalDate date);
  
    @Query(value = "select f.code , p.population, count(f) from Forsale f, Population p where f.code = p.code and f.code like concat(:code, '%') group by f.code order by f.code ASC")
    List<Object[]> getMapDtoByRegion(@Param("code") String code);

    @Query(value = "select f.code , p.population, count(f) from Forsale f, Population p where f.code = p.code and f.code like concat('%', :code) group by f.code order by f.code ASC")
    List<Object[]> getMapDtoByRegionCity(@Param("code") String code);
}
