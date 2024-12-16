package pe.I202224552.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.I202224552.cibertec.model.Car;

@Repository
public interface ICarRepository extends JpaRepository<Car, Integer> {

}
