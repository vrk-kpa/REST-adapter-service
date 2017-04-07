/**
 * The MIT License
 * Copyright © 2017 Population Register Centre (VRK)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pkrete.restgateway.util;

import junit.framework.TestCase;

/**
 * Test cases for RESTGatewayUtil class.
 *
 * @author Petteri Kivimäki
 */
public class RESTGatewayUtilTest extends TestCase {

    /**
     * Test for null value.
     */
    public void testIsXml1() {
        assertEquals(false, RESTGatewayUtil.isXml(null));
    }

    /**
     * Test for an empty string.
     */
    public void testIsXml2() {
        assertEquals(false, RESTGatewayUtil.isXml(""));
    }

    /**
     * Test for "string/xml".
     */
    public void testIsXml3() {
        assertEquals(true, RESTGatewayUtil.isXml("text/xml"));
    }

    /**
     * Test for "application/json".
     */
    public void testIsXml4() {
        assertEquals(false, RESTGatewayUtil.isXml("application/json"));
    }

    /**
     * Test for "application/XML". Wrong case.
     */
    public void testIsXml5() {
        assertEquals(false, RESTGatewayUtil.isXml("application/XML"));
    }

    /**
     * Test for "text/html".
     */
    public void testIsXml6() {
        assertEquals(false, RESTGatewayUtil.isXml("text/html"));
    }
}
