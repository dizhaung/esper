/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.epl.pattern.observer;

import com.espertech.esper.common.internal.epl.expression.core.ExprEvaluatorContext;
import com.espertech.esper.common.internal.epl.expression.time.abacus.TimeAbacus;
import com.espertech.esper.common.internal.epl.pattern.core.MatchedEventConvertor;
import com.espertech.esper.common.internal.filterspec.MatchedEventMap;
import com.espertech.esper.common.internal.schedule.ScheduleParameterException;

import java.util.TimeZone;

interface TimerScheduleSpecCompute {
    TimerScheduleSpec compute(MatchedEventConvertor optionalConvertor, MatchedEventMap beginState, ExprEvaluatorContext exprEvaluatorContext, TimeZone timeZone, TimeAbacus timeAbacus)
            throws ScheduleParameterException;
}