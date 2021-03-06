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

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

/**
 * <p>
 *   A request object encapsulating the necessary parameters to create a {@link JobType#BULK_CASE_UPDATE} job.
 * </p>
 *
 * Created by Matt Kranzler on 6/14/16.
 * Copyright (c) 2016 Desk.com. All rights reserved.
 */
public class BulkCaseUpdateRequest implements Serializable {

  private static final long serialVersionUID = 5093696937464464025L;

  private JobType type = JobType.BULK_CASE_UPDATE;
  @SerializedName("case")
  private Case deskCase;
  private int[] caseIds;
  private Integer filterId;

  /**
   * Creates a bulk case update job for an array of case ids
   *
   * @param deskCase the shallow case containing the updates
   * @param caseIds the case ids to update
   */
  public BulkCaseUpdateRequest(@NotNull Case deskCase, @NotNull int[] caseIds) {
    this.deskCase = deskCase;
    this.caseIds = caseIds;
  }

  /**
   * Creates a bulk case update job for cases matching a filter id
   *
   * @param deskCase the shallow case containing the updates
   * @param filterId the filter id to find cases
   */
  public BulkCaseUpdateRequest(@NotNull Case deskCase, @NotNull Integer filterId) {
    this.deskCase = deskCase;
    this.filterId = filterId;
  }

}
