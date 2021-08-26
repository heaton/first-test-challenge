package me.heaton

import io.kotest.core.spec.style.WordSpec

class TaxiSpec : WordSpec({
    "Taxi" should {
        "charge the base price for distance < 2 km" {
            Taxi().charge(distance = 2, waitTime = 0) shouldBe 6
        }
    }
})