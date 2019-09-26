package com.dantas.interfaces

import com.dantas.models.produto
import org.springframework.data.repository.CrudRepository
interface interfaceProduto:CrudRepository<produto, Long>