package com.cry.it.make.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SmileFaceTest {

    @Test
    public void should_smile() throws Exception {
        assertThat(new SmileFace().face(), is("smile"));
    }
}