package br.com.triersistemas.alugueltemporada.repository;

import br.com.triersistemas.alugueltemporada.domain.Hospedes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface HospedesRepository extends JpaRepository<Hospedes, UUID> {


}
