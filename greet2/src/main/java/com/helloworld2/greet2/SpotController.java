package com.helloworld2.greet2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpotController {
    @GetMapping("/spot")
    public List<Place> getSpots() {
        return List.of(
                new Place("Tokyo",
                        List.of(
                                new Spot("Tokyo Tower"),
                                new Spot("Sensous Temple"),
                                new Spot("Shibuya Crossing")
                        )
                ),
                new Place("Kyoto",
                        List.of(
                                new Spot("Kinkaku-ji"),
                                new Spot("Fushimi Inari Taisha"),
                                new Spot("Arashiyama Bamboo Grove")
                        )
                ),
                new Place("Hokkaido",
                        List.of(
                                new Spot("Sapporo"),
                                new Spot("Asahiyama Zoo"),
                                new Spot("Shiretoko")
                        )
                )
        );
    }
}
