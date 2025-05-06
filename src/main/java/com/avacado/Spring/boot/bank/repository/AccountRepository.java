package com.avacado.Spring.boot.bank.repository;

import com.avacado.Spring.boot.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
