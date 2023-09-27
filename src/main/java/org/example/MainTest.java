package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void BMIAnalyst() {
        Analyst a = new Analyst();
        assertEquals("Thừa cân", a.BMIAnalyst(50, 1.40));
        assertEquals("Bình thường", a.BMIAnalyst(60, 1.60));
        assertEquals("Gầy", a.BMIAnalyst(50, 1.70));
        assertEquals("Béo phì độ 1", a.BMIAnalyst(70, 1.50));
        assertEquals("Bình thường", a.BMIAnalyst(80, 1.80));
        assertEquals("Bình thường", a.BMIAnalyst(80, 1.90));
        assertEquals("Bình thường", a.BMIAnalyst(90, 1.90));
        assertEquals("Béo phì độ 3", a.BMIAnalyst(90, 1.50));
        assertEquals("Béo phì độ 3", a.BMIAnalyst(100, 1.50));
        assertEquals("Chỉ số không hợp lệ", a.BMIAnalyst(-100, 1.50));
        assertEquals("Chỉ số không hợp lệ", a.BMIAnalyst(1000, 1.50));
    }
}