/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Abhijit Parida <abhijitparida.me@gmail.com>
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

package app.abhijit.iter.models;

import com.google.common.collect.ImmutableList;

@Deprecated
public class Student {

    private final String mName;

    private final String mRegistrationNumber;

    private final boolean mSelected;

    private final ImmutableList<Subject> mSubjects;

    public Student(String name, String registrationNumber, boolean selected,
                   ImmutableList<Subject> subjects) {
        mName = name;
        mRegistrationNumber = registrationNumber;
        mSelected = selected;
        mSubjects = subjects;
    }

    public String getName() {
        return mName;
    }

    public String getRegistrationNumber() {
        return mRegistrationNumber;
    }

    public boolean isSelected() {
        return mSelected;
    }

    public ImmutableList<Subject> getSubjects() {
        return mSubjects;
    }
}