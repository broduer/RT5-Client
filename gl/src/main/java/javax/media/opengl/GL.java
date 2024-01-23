package javax.media.opengl;

import org.openrs2.deob.annotation.OriginalClass;

@OriginalClass("gl!javax/media/opengl/GL")
public interface GL {

	int GL_POINTS = 0x0;

	int GL_ONE = 0x1;

	int GL_LINES = 0x1;

	int GL_LINE_LOOP = 0x2;

	int GL_TRIANGLES = 0x4;

	int GL_QUADS = 0x7;

	int GL_DEPTH_BUFFER_BIT = 0x100;

	int GL_LEQUAL = 0x203;

	int GL_GREATER = 0x204;

	int GL_SRC_ALPHA = 0x302;

	int GL_ONE_MINUS_SRC_ALPHA = 0x303;

	int GL_DST_COLOR = 0x306;

	int GL_FRONT = 0x404;

	int GL_BACK = 0x405;

	int GL_VIEWPORT_BIT = 0x800;

	int GL_CULL_FACE = 0xB44;

	int GL_LIGHTING = 0xB50;

	int GL_LIGHT_MODEL_AMBIENT = 0xB53;

	int GL_COLOR_MATERIAL = 0xB57;

	int GL_FOG = 0xB60;

	int GL_FOG_DENSITY = 0xB62;

	int GL_FOG_START = 0xB63;

	int GL_FOG_END = 0xB64;

	int GL_FOG_MODE = 0xB65;

	int GL_FOG_COLOR = 0xB66;

	int GL_DEPTH_TEST = 0xB71;

	int GL_MODELVIEW_MATRIX = 0xBA6;

	int GL_ALPHA_TEST = 0xBC0;

	int GL_BLEND = 0xBE2;

	int GL_SCISSOR_TEST = 0xC11;

	int GL_FOG_HINT = 0xC54;

	int GL_TEXTURE_GEN_S = 0xC60;

	int GL_TEXTURE_GEN_T = 0xC61;

	int GL_TEXTURE_GEN_R = 0xC62;

	int GL_TEXTURE_GEN_Q = 0xC63;

	int GL_UNPACK_ROW_LENGTH = 0xCF2;

	int GL_UNPACK_ALIGNMENT = 0xCF5;

	int GL_RED_SCALE = 0xD14;

	int GL_RED_BIAS = 0xD15;

	int GL_GREEN_SCALE = 0xD18;

	int GL_GREEN_BIAS = 0xD19;

	int GL_BLUE_SCALE = 0xD1A;

	int GL_BLUE_BIAS = 0xD1B;

	int GL_TEXTURE_2D = 0xDE1;

	int GL_FASTEST = 0x1101;

	int GL_AMBIENT = 0x1200;

	int GL_DIFFUSE = 0x1201;

	int GL_POSITION = 0x1203;

	int GL_CONSTANT_ATTENUATION = 0x1207;

	int GL_LINEAR_ATTENUATION = 0x1208;

	int GL_QUADRATIC_ATTENUATION = 0x1209;

	int GL_COMPILE = 0x1300;

	int GL_UNSIGNED_BYTE = 0x1401;

	int GL_FLOAT = 0x1406;

	int GL_AMBIENT_AND_DIFFUSE = 0x1602;

	int GL_MODELVIEW = 0x1700;

	int GL_PROJECTION = 0x1701;

	int GL_TEXTURE = 0x1702;

	int GL_COLOR = 0x1800;

	int GL_ALPHA = 0x1906;

	int GL_RGBA = 0x1908;

	int GL_FILL = 0x1B02;

	int GL_SMOOTH = 0x1D01;

	int GL_VENDOR = 0x1F00;

	int GL_RENDERER = 0x1F01;

	int GL_VERSION = 0x1F02;

	int GL_EXTENSIONS = 0x1F03;

	int GL_S = 0x2000;

	int GL_T = 0x2001;

	int GL_R = 0x2002;

	int GL_Q = 0x2003;

	int GL_TEXTURE_ENV_MODE = 0x2200;

	int GL_TEXTURE_ENV_COLOR = 0x2201;

	int GL_TEXTURE_ENV = 0x2300;

	int GL_EYE_LINEAR = 0x2400;

	int GL_OBJECT_LINEAR = 0x2401;

	int GL_TEXTURE_GEN_MODE = 0x2500;

	int GL_OBJECT_PLANE = 0x2501;

	int GL_EYE_PLANE = 0x2502;

	int GL_NEAREST = 0x2600;

	int GL_LINEAR = 0x2601;

	int GL_NEAREST_MIPMAP_NEAREST = 0x2700;

	int GL_LINEAR_MIPMAP_LINEAR = 0x2703;

	int GL_TEXTURE_MAG_FILTER = 0x2800;

	int GL_TEXTURE_MIN_FILTER = 0x2801;

	int GL_TEXTURE_WRAP_S = 0x2802;

	int GL_TEXTURE_WRAP_T = 0x2803;

	int GL_REPEAT = 0x2901;

	int GL_COLOR_BUFFER_BIT = 0x4000;

	int GL_LIGHT0 = 0x4000;

	int GL_LIGHT1 = 0x4001;

	int GL_LIGHT2 = 0x4002;

	int GL_FUNC_ADD = 0x8006;

	int GL_FUNC_SUBTRACT = 0x800A;

	int GL_VERTEX_ARRAY = 0x8074;

	int GL_NORMAL_ARRAY = 0x8075;

	int GL_COLOR_ARRAY = 0x8076;

	int GL_TEXTURE_COORD_ARRAY = 0x8078;

	int GL_MULTISAMPLE = 0x809D;

	int GL_BGRA = 0x80E1;

	int GL_CLAMP_TO_EDGE = 0x812F;

	int GL_TEXTURE0 = 0x84C0;

	int GL_TEXTURE1 = 0x84C1;

	int GL_MAX_TEXTURE_UNITS = 0x84E2;

	int GL_NORMAL_MAP = 0x8511;

	int GL_REFLECTION_MAP = 0x8512;

	int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

	int GL_COMBINE = 0x8570;

	int GL_COMBINE_RGB = 0x8571;

	int GL_COMBINE_ALPHA = 0x8572;

	int GL_RGB_SCALE = 0x8573;

	int GL_SRC0_RGB = 0x8580;

	int GL_SRC0_ALPHA = 0x8588;

	int GL_OPERAND0_RGB = 0x8590;

	int GL_OPERAND0_ALPHA = 0x8598;

	int GL_VERTEX_PROGRAM_ARB = 0x8620;

	int GL_PROGRAM_ERROR_POSITION_ARB = 0x864B;

	int GL_FRAGMENT_PROGRAM_ARB = 0x8804;

	int GL_RGBA16F = 0x881A;

	int GL_MAX_TEXTURE_COORDS = 0x8871;

	int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;

	int GL_PROGRAM_FORMAT_ASCII_ARB = 0x8875;

	int GL_ARRAY_BUFFER = 0x8892;

	int GL_ELEMENT_ARRAY_BUFFER = 0x8893;

	int GL_STREAM_DRAW = 0x88E0;

	int GL_STATIC_DRAW = 0x88E4;

	int GL_FRAGMENT_SHADER = 0x8B30;

	int GL_COMPILE_STATUS = 0x8B81;

	int GL_LINK_STATUS = 0x8B82;

	int GL_INFO_LOG_LENGTH = 0x8B84;

	int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;

	int GL_FRAMEBUFFER = 0x8D40;

	int GL_RENDERBUFFER = 0x8D41;
}