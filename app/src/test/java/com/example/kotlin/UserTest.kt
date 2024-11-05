package com.example.kotlin

import com.example.kotlin.test_sample_live.User
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsNotAdult() {
        val user = User("John", 15)
        assertFalse(user.isAdult())
    }

    @Test
    fun testIsTeenager() {
        val user = User("John", 16)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsNotTeenager() {
        val user = User("John", 19)
        assertFalse(user.isTeenager())
    }

    @Test
    fun testIsChild() {
        val user = User("John", 10)
        assertTrue(user.isChild())
    }

    @Test
    fun testIsNotChild() {
        val user = User("John", 15)
        assertFalse(user.isChild())
    }
}