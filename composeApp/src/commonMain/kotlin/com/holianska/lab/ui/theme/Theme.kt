package com.holianska.lab.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import lab.composeapp.generated.resources.Res
import lab.composeapp.generated.resources.playfair_display
import org.jetbrains.compose.resources.Font

// Світла схема (на основі вашого Color.kt)
private val lightScheme = lightColorScheme(
    primary = _root_ide_package_.com.holianska.lab.ui.theme.primaryLight,
    onPrimary = _root_ide_package_.com.holianska.lab.ui.theme.onPrimaryLight,
    primaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.primaryContainerLight,
    onPrimaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.onPrimaryContainerLight,
    secondary = _root_ide_package_.com.holianska.lab.ui.theme.secondaryLight,
    onSecondary = _root_ide_package_.com.holianska.lab.ui.theme.onSecondaryLight,
    secondaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.secondaryContainerLight,
    onSecondaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.onSecondaryContainerLight,
    tertiary = _root_ide_package_.com.holianska.lab.ui.theme.tertiaryLight,
    onTertiary = _root_ide_package_.com.holianska.lab.ui.theme.onTertiaryLight,
    tertiaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.tertiaryContainerLight,
    onTertiaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.onTertiaryContainerLight,
    error = _root_ide_package_.com.holianska.lab.ui.theme.errorLight,
    onError = _root_ide_package_.com.holianska.lab.ui.theme.onErrorLight,
    errorContainer = _root_ide_package_.com.holianska.lab.ui.theme.errorContainerLight,
    onErrorContainer = _root_ide_package_.com.holianska.lab.ui.theme.onErrorContainerLight,
    background = _root_ide_package_.com.holianska.lab.ui.theme.backgroundLight,
    onBackground = _root_ide_package_.com.holianska.lab.ui.theme.onBackgroundLight,
    surface = _root_ide_package_.com.holianska.lab.ui.theme.surfaceLight,
    onSurface = _root_ide_package_.com.holianska.lab.ui.theme.onSurfaceLight,
    surfaceVariant = _root_ide_package_.com.holianska.lab.ui.theme.surfaceVariantLight,
    onSurfaceVariant = _root_ide_package_.com.holianska.lab.ui.theme.onSurfaceVariantLight,
    outline = _root_ide_package_.com.holianska.lab.ui.theme.outlineLight,
    outlineVariant = _root_ide_package_.com.holianska.lab.ui.theme.outlineVariantLight,
    scrim = _root_ide_package_.com.holianska.lab.ui.theme.scrimLight,
    inverseSurface = _root_ide_package_.com.holianska.lab.ui.theme.inverseSurfaceLight,
    inverseOnSurface = _root_ide_package_.com.holianska.lab.ui.theme.inverseOnSurfaceLight,
    inversePrimary = _root_ide_package_.com.holianska.lab.ui.theme.inversePrimaryLight,
    surfaceDim = _root_ide_package_.com.holianska.lab.ui.theme.surfaceDimLight,
    surfaceBright = _root_ide_package_.com.holianska.lab.ui.theme.surfaceBrightLight,
    surfaceContainerLowest = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerLowestLight,
    surfaceContainerLow = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerLowLight,
    surfaceContainer = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerLight,
    surfaceContainerHigh = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerHighLight,
    surfaceContainerHighest = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerHighestLight,
)

// Темна схема (на основі вашого Color.kt)
private val darkScheme = darkColorScheme(
    primary = _root_ide_package_.com.holianska.lab.ui.theme.primaryDark,
    onPrimary = _root_ide_package_.com.holianska.lab.ui.theme.onPrimaryDark,
    primaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.primaryContainerDark,
    onPrimaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.onPrimaryContainerDark,
    secondary = _root_ide_package_.com.holianska.lab.ui.theme.secondaryDark,
    onSecondary = _root_ide_package_.com.holianska.lab.ui.theme.onSecondaryDark,
    secondaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.secondaryContainerDark,
    onSecondaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.onSecondaryContainerDark,
    tertiary = _root_ide_package_.com.holianska.lab.ui.theme.tertiaryDark,
    onTertiary = _root_ide_package_.com.holianska.lab.ui.theme.onTertiaryDark,
    tertiaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.tertiaryContainerDark,
    onTertiaryContainer = _root_ide_package_.com.holianska.lab.ui.theme.onTertiaryContainerDark,
    error = _root_ide_package_.com.holianska.lab.ui.theme.errorDark,
    onError = _root_ide_package_.com.holianska.lab.ui.theme.onErrorDark,
    errorContainer = _root_ide_package_.com.holianska.lab.ui.theme.errorContainerDark,
    onErrorContainer = _root_ide_package_.com.holianska.lab.ui.theme.onErrorContainerDark,
    background = _root_ide_package_.com.holianska.lab.ui.theme.backgroundDark,
    onBackground = _root_ide_package_.com.holianska.lab.ui.theme.onBackgroundDark,
    surface = _root_ide_package_.com.holianska.lab.ui.theme.surfaceDark,
    onSurface = _root_ide_package_.com.holianska.lab.ui.theme.onSurfaceDark,
    surfaceVariant = _root_ide_package_.com.holianska.lab.ui.theme.surfaceVariantDark,
    onSurfaceVariant = _root_ide_package_.com.holianska.lab.ui.theme.onSurfaceVariantDark,
    outline = _root_ide_package_.com.holianska.lab.ui.theme.outlineDark,
    outlineVariant = _root_ide_package_.com.holianska.lab.ui.theme.outlineVariantDark,
    scrim = _root_ide_package_.com.holianska.lab.ui.theme.scrimDark,
    inverseSurface = _root_ide_package_.com.holianska.lab.ui.theme.inverseSurfaceDark,
    inverseOnSurface = _root_ide_package_.com.holianska.lab.ui.theme.inverseOnSurfaceDark,
    inversePrimary = _root_ide_package_.com.holianska.lab.ui.theme.inversePrimaryDark,
    surfaceDim = _root_ide_package_.com.holianska.lab.ui.theme.surfaceDimDark,
    surfaceBright = _root_ide_package_.com.holianska.lab.ui.theme.surfaceBrightDark,
    surfaceContainerLowest = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerLowestDark,
    surfaceContainerLow = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerLowDark,
    surfaceContainer = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerDark,
    surfaceContainerHigh = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerHighDark,
    surfaceContainerHighest = _root_ide_package_.com.holianska.lab.ui.theme.surfaceContainerHighestDark,
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) _root_ide_package_.com.holianska.lab.ui.theme.darkScheme else _root_ide_package_.com.holianska.lab.ui.theme.lightScheme

    val playfairFont = Font(Res.font.playfair_display)

    val appTypography = remember {
        _root_ide_package_.com.holianska.lab.ui.theme.getTypography(
            playfairFont
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = appTypography,
        content = content
    )
}