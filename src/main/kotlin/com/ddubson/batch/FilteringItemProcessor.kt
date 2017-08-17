package com.ddubson.batch

import com.ddubson.batch.domain.Customer
import org.springframework.batch.item.ItemProcessor

class FilteringItemProcessor : ItemProcessor<Customer, Customer> {
    override fun process(item: Customer): Customer? {
        return if (item.id % 2L != 0L) item else null
    }
}