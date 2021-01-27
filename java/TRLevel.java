import java.io.*;
public class TRLevel{
	public TRLevel(DataInputStream dis){

	}
/*
        Level(Stream &stream) {
            memset(this, 0, sizeof(*this));
            version     = VER_UNKNOWN;
            cutEntity   = -1;
            meshesCount = 0;

            uint32 magic;

            #define MAGIC_TR1_PC  0x00000020
            #define MAGIC_TR1_PSX 0x56414270
            #define MAGIC_TR1_SAT 0x4D4F4F52
            #define MAGIC_TR2_PC  0x0000002D
            #define MAGIC_TR3_PC1 0xFF080038
            #define MAGIC_TR3_PC2 0xFF180038
            #define MAGIC_TR3_PC3 0xFF180034
            #define MAGIC_TR3_PSX 0xFFFFFFC8
            #define MAGIC_TR4_PC  0x00345254

            id = TR::getLevelID(stream.size, stream.name, version, isDemoLevel);

            if (version == VER_UNKNOWN || version == VER_TR1_PC || version == VER_TR1_PSX || version == VER_TR1_SAT || version == VER_TR3_PSX) {
                stream.read(magic);

                if (magic != MAGIC_TR1_PC  &&
                    magic != MAGIC_TR1_SAT &&
                    magic != MAGIC_TR2_PC  &&
                    magic != MAGIC_TR3_PC1 &&
                    magic != MAGIC_TR3_PC2 &&
                    magic != MAGIC_TR3_PC3 &&
                    magic != MAGIC_TR3_PSX &&
                    magic != MAGIC_TR4_PC) {
                    stream.read(magic);
                }

                switch (magic) {
                    case MAGIC_TR1_PC  : version = VER_TR1_PC;  break;
                    case MAGIC_TR1_PSX : version = VER_TR1_PSX; break;
                    case MAGIC_TR1_SAT : version = VER_TR1_SAT; break;
                    case MAGIC_TR2_PC  : version = VER_TR2_PC;  break;
                    case MAGIC_TR3_PC1 :
                    case MAGIC_TR3_PC2 : 
                    case MAGIC_TR3_PC3 : version = VER_TR3_PC;  break;
                    case MAGIC_TR3_PSX : version = VER_TR3_PSX; break;
                    case MAGIC_TR4_PC  : version = VER_TR4_PC;  break;
                    default            : ;
                }
            }

            if (version == VER_UNKNOWN) {
                LOG("unsupported level format\n"); 
                ASSERT(false);
                return;
            }

        #ifdef _GAPI_SW
            ASSERT((version & VER_TR1_PC) == VER_TR1_PC);
            if ((version & VER_TR1_PC) != VER_TR1_PC) {
                return;
            }
        #endif

        #ifdef _GAPI_GU
            ASSERT((version & VER_TR1_PSX) == VER_TR1_PSX);
            if ((version & VER_TR1_PSX) != VER_TR1_PSX) {
                return;
            }
        #endif

            switch (version) {
                case VER_TR1_PC   : loadTR1_PC  (stream); break;
                case VER_TR1_PSX  : loadTR1_PSX (stream); break;
                case VER_TR1_SAT  : loadTR1_SAT (stream); break;
                case VER_TR2_PC   : loadTR2_PC  (stream); break;
                case VER_TR2_PSX  : loadTR2_PSX (stream); break;
                case VER_TR3_PC   : loadTR3_PC  (stream); break;
                case VER_TR3_PSX  : loadTR3_PSX (stream); break;
            #ifdef USE_INFLATE
                case VER_TR4_PC   : loadTR4_PC  (stream); break;
            #endif
                case VER_TR4_PSX  : loadTR4_PSX (stream); break;
                case VER_TR4_SDC  : loadTR4_SDC (stream); break;
                case VER_TR5_PC   : loadTR5_PC  (stream); break;
                case VER_TR5_PSX  : loadTR5_PSX (stream); break;
                case VER_TR5_SDC  : loadTR5_SDC (stream); break;
                default           : ASSERT(false);
            }

            prepare();
        }
*/
}
