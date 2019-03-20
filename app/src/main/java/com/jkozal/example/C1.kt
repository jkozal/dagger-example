package com.jkozal.example

import com.jkozal.domain.C2
import dagger.Component

@Component(dependencies = [C2::class])
interface C1
