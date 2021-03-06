/*
 * Copyright (c) 2016, Salesforce.com, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of Salesforce.com, Inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.desk.java.apiclient.model;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FilterLinks extends Links {

    private static final long serialVersionUID = 5628595002692756311L;

    private Link cases;
    private Link companies;
    private Link customers;
    private Link opportunities;

    @NotNull
    public Link getCases() {
        return cases == null ? new Link() : cases;
    }

    @NotNull
    public Link getCompanies() {
        return companies == null ? new Link() : companies;
    }

    @NotNull
    public Link getCustomers() {
        return customers == null ? new Link() : customers;
    }

    @NotNull
    public Link getOpportunities() {
        return opportunities == null ? new Link() : opportunities;
    }

    public void setCases(@Nullable Link cases) {
        this.cases = cases;
    }

    public void setCompanies(@Nullable Link companies) {
        this.companies = companies;
    }

    public void setCustomers(@Nullable Link customers) {
        this.customers = customers;
    }

    public void setOpportunities(@Nullable Link opportunities) {
        this.opportunities = opportunities;
    }
}
