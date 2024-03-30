/*
 *  Copyright (C) 2022-2024. Maximilian Keppeler (https://www.maxkeppeler.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.maxkeppeler.sheets.option.models

import androidx.compose.runtime.Composable
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

/**
 * Details information for an option.
 * @param title The text that is used in the title.
 * @param body The text that is used in the body.
 * @param postView The content that can be added after the body.
 */
@Serializable
class OptionDetails(
    val title: String,
    val body: String,
    @Transient val postView: (@Composable (selected: Boolean) -> Unit)? = null,
)