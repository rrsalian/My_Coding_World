/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 HackerEarth
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:*
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.*
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.hackerearth.heapi.sdk.requests;

import com.google.gson.Gson;
import com.hackerearth.heapi.sdk.options.CompileOptions;
import com.hackerearth.heapi.sdk.responses.CompileResponse;
import org.apache.http.NameValuePair;

import java.util.List;

public class CompileRequest extends  BaseRequest{

    public static final String COMPILE_ENDPOINT = "https://api.hackerearth.com/v3/code/compile/";

    public CompileRequest(String clientSecret, CompileOptions params){
        super(clientSecret, params);
    }

    @Override
    public CompileResponse Execute(){
        Gson gson = new Gson();
        this.options.setClientSecret(this.clientSecret);
        List<NameValuePair> parameters = this.options.getURLParameters();
        String responseString = sendRequest(COMPILE_ENDPOINT, parameters);
        CompileResponse response = gson.fromJson(responseString, CompileResponse.class);
        return response;
    }
}