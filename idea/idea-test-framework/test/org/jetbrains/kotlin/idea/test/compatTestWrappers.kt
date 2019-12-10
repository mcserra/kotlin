/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("unused", "IncompatibleAPI", "PropertyName")

package org.jetbrains.kotlin.idea.test

import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Document
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiFile
import com.intellij.testFramework.LightIdeaTestCase
import com.intellij.testFramework.LightPlatformCodeInsightTestCase
import com.intellij.testFramework.LightPlatformTestCase

// BUNCH: as36, 191
@Suppress("DEPRECATION")
@Deprecated("Use KotlinLightCodeInsightFixtureTestCase instead")
abstract class KotlinLightCodeInsightTestCase : com.intellij.testFramework.LightCodeInsightTestCase() {
    protected inline val project_: Project get() = LightPlatformTestCase.getProject()
    protected inline val module_: Module get() = LightPlatformTestCase.getModule()
    protected inline val editor_: Editor get() = LightPlatformCodeInsightTestCase.getEditor()
    protected inline val file_: PsiFile get() = LightPlatformCodeInsightTestCase.getFile()
    protected inline val currentEditorDataContext_: DataContext get() = LightPlatformCodeInsightTestCase.getCurrentEditorDataContext()

    protected fun configureFromFileText_(fileName: String, fileText: String): Document {
        return LightPlatformCodeInsightTestCase.configureFromFileText(fileName, fileText, false)
    }
}

// BUNCH: as36, 191
abstract class KotlinLightIdeaTestCase : LightIdeaTestCase() {
    protected inline val project_: Project get() = LightPlatformTestCase.getProject()
    protected inline val module_: Module get() = LightPlatformTestCase.getModule()
}