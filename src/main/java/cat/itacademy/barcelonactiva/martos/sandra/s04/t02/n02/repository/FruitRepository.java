package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n02.repository;

import cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n02.domain.Fruit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Long> {

}
