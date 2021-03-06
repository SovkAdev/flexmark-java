package com.vladsch.flexmark.docx.converter.util;

import org.docx4j.wml.RPr;

public class StrikethroughRunFormatProvider<T> extends RunFormatProviderBase<T> {
    public StrikethroughRunFormatProvider(final DocxContext<T> docx) {
        super(docx, RunFormatProvider.STRIKE_THROUGH_STYLE);
    }

    @Override
    public void getRPr(final RPr rPr) {
        super.getRPr(rPr);
        //rPr.setStrike(docx.getFactory().createBooleanDefaultTrue());
    }
}
