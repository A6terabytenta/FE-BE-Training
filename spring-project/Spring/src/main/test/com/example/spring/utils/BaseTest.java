package com.example.spring.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mockito.Mock;

public class BaseTest {
  protected @Mock HttpServletRequest request;
  protected @Mock HttpServletResponse response;
}
