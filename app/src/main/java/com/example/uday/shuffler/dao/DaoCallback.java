package com.example.uday.shuffler.dao;

import com.android.volley.VolleyError;

public interface DaoCallback {

    void response(Object response);

    void stringResponse(String response);

    void errorResponse(VolleyError error);
}
