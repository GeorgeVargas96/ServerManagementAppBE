package io.getarrays.server.repo;

import io.getarrays.server.domain.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
