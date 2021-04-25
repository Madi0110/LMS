package kz.iitu.remont.repository;


import kz.iitu.remont.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DeviceRepository extends JpaRepository<Device,Long> {
    List<Device> findByIsDoneFalse();
    List<Device> findByIsDoneTrue();
}
