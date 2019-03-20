package com.jkozal.domain

import com.jkozal.model.C3
import dagger.Component

@Component(dependencies = [C3::class])
interface C2
